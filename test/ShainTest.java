package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.Shain;

class ShainTest {

    private Shain shain;

    // 各テストの前に Shain インスタンスを初期化
    @BeforeEach
    void setUp() {
        shain = new Shain();
    }

    @Test
    void testGetAndSetShainId() {
        shain.setShainId(10);
        assertEquals(10, shain.getShainId(), "Shain ID が正しく設定されていません。");
    }

    @Test
    void testGetAndSetShimei() {
        shain.setShimei("Tanaka Ichiro");
        assertEquals("Tanaka Ichiro", shain.getShimei(), "氏名が正しく設定されていません。");
    }

    @Test
    void testGetAndSetBusho() {
        shain.setBusho("IT");
        assertEquals("IT", shain.getBusho(), "部署が正しく設定されていません。");
    }

    @Test
    void testGetAndSetBikou() {
        shain.setBikou("Project Manager");
        assertEquals("Project Manager", shain.getBikou(), "備考が正しく設定されていません。");
    }

    @Test
    void testToCsv() {
        // フィールドに値を設定
        shain.setShainId(5);
        shain.setShimei("Kato Jiro");
        shain.setBusho("Engineering");
        shain.setBikou("Senior Engineer");

        // CSV形式の文字列を生成
        String expectedCsv = "5,Kato Jiro,Engineering,Senior Engineer";
        String actualCsv = shain.toCsv();

        // 期待値と実際の値を比較
        assertEquals(expectedCsv, actualCsv, "toCsv メソッドの結果が正しくありません。");
    }

    @Test
    void testFromCsv() {
        // CSV形式のデータ
        String csvData = "7,Matsuda Yuki,Finance,Accountant";

        // CSVデータをパースして Shain インスタンスを更新
        shain.fromCsv(csvData);

        // 各フィールドが期待通りに設定されたかを確認
        assertEquals(7, shain.getShainId(), "Shain ID が正しくありません。");
        assertEquals("Matsuda Yuki", shain.getShimei(), "氏名が正しくありません。");
        assertEquals("Finance", shain.getBusho(), "部署が正しくありません。");
        assertEquals("Accountant", shain.getBikou(), "備考が正しくありません。");
    }

}
