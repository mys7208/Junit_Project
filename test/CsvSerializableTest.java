package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import models.Shain;

class CsvSerializableTest {

    @Test
    void testToCsv() {
        // Shain インスタンスの作成
        Shain shain = new Shain();
        shain.setShainId(1);
        shain.setShimei("Yamada Taro");
        shain.setBusho("Sales");
        shain.setBikou("Top Salesman");

        // CSV形式の文字列を生成
        String expectedCsv = "1,Yamada Taro,Sales,Top Salesman";
        String actualCsv = shain.toCsv();

        // 期待値と実際の値を比較
        assertEquals(expectedCsv, actualCsv, "toCsv メソッドの結果が正しくありません。");
    }

    @Test
    void testFromCsv() {
        // Shain インスタンスの作成
        Shain shain = new Shain();
        String csvData = "2,Suzuki Hanako,HR,HR Manager";

        // CSV形式のデータをパースして Shain インスタンスを更新
        shain.fromCsv(csvData);

        // 各フィールドが期待通りに設定されたかを確認
        assertEquals(2, shain.getShainId(), "Shain ID が正しくありません。");
        assertEquals("Suzuki Hanako", shain.getShimei(), "氏名が正しくありません。");
        assertEquals("HR", shain.getBusho(), "部署が正しくありません。");
        assertEquals("HR Manager", shain.getBikou(), "備考が正しくありません。");
    }
}
