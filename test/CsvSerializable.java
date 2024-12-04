package test;

import java.lang.reflect.Field;
import java.util.StringJoiner;

public abstract class CsvSerializable {
    
    // 全項目をCSV形式で取得するメソッド
    public String toCsv(Object... fields) {
        StringJoiner joiner = new StringJoiner(",");
        for (Object field : fields) {
            joiner.add(field.toString());
        }
        return joiner.toString();
    }

    // CSV形式の引数で各項目を更新するメソッド（リフレクションを使用）
    public void fromCsv(String csv) {
        String[] parts = csv.split(",");
        Field[] fields = this.getClass().getDeclaredFields();

        // フィールドの数とCSVの要素数を比較して、必要に応じて長さを調整
        int length = Math.min(parts.length, fields.length);

        try {
            for (int i = 0; i < length; i++) {
                Field field = fields[i];
                field.setAccessible(true);

                // フィールドの型に応じて適切に変換
                if (field.getType() == int.class) {
                    field.setInt(this, Integer.parseInt(parts[i].trim()));
                } else if (field.getType() == String.class) {
                    field.set(this, parts[i].trim());
                }
            }
        } catch (IllegalAccessException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

