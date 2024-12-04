package models;

public class Shain extends CsvSerializable {
    // フィールド
    private int shainId;
    private String shimei;
    private String busho;
    private String bikou;

    // コンストラクタ
    public Shain() {
    }

    // GetterとSetter
    public int getShainId() {
        return shainId;
    }

    public void setShainId(int shainId) {
        this.shainId = shainId;
    }

    public String getShimei() {
        return shimei;
    }

    public void setShimei(String shimei) {
        this.shimei = shimei;
    }

    public String getBusho() {
        return busho;
    }

    public void setBusho(String busho) {
        this.busho = busho;
    }

    public String getBikou() {
        return bikou;
    }

    public void setBikou(String bikou) {
        this.bikou = bikou;
    }

    // 全項目をCSV形式で取得するメソッド（スーパークラスのメソッドを利用）
    public String toCsv() {
        return super.toCsv(shainId, shimei, busho, bikou);
    }
}
