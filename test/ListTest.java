package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    private class Model {

        public Model(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        private int id;
    }

    private List<String> actualStrList = new ArrayList<>(Arrays.asList("1", "2"));
    ;

    private List<Model> modelList = new ArrayList<>(
        Arrays.asList(new Model(1), new Model(2), new Model(3))
    );

    private void out(String value)
    {
        System.out.println(value);
    }

    @BeforeEach
    void setUp() {

    }

    @Test
    void test_constructor() {
        this.out("コンストラクタ");
        this.out("List<String> actualStrList = new ArrayList<>(Arrays.asList(\"1\", \"2\"));");
        this.out("assertEquals(2, actualStrList.size());");

        List<String> actualStrList = new ArrayList<>(Arrays.asList("1", "2"));

        assertEquals(2, actualStrList.size());
    }

    @Test
    public  void test_size() {
        this.out("// リスト件数");
        this.out("List<String> actualStrList = new ArrayList<>(Arrays.asList(\"1\", \"2\"));");
        this.out("assertEquals(2, actualStrList.size());");

        // リスト件数
        List<String> actualStrList = new ArrayList<>(Arrays.asList("1", "2"));

        assertEquals(2, actualStrList.size());
    }

    @Test
    public void test_add() {
        System.out.println("*------------------------*");
        System.out.println("//リスト追加");
        System.out.println("List<String>actualStrList=newArrayList<>(Arrays.asList(\"1\",\"2\"));");
        System.out.println("actualStrList.add(\"3\");");
        System.out.println("//期待値を生成");
        System.out.println("List<String>expected=newArrayList<String>(Arrays.asList(\"1\",\"2\",\"3\"));");
        System.out.println("assertEquals(expected,actualStrList);");

        // リスト追加
        List<String> actualStrList = new ArrayList<>(Arrays.asList("1", "2"));
        actualStrList.add("3");
        // 期待値を生成
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        assertEquals(expected, actualStrList);
    }

    @Test
    public  void test_get_Index() {
        System.out.println("*------------------------*");
        System.out.println("// リストの値をインデックスで取得");
        System.out.println("List<String>actualStrList=newArrayList<>(Arrays.asList(\"1\",\"2\"));");
        System.out.println("assertEquals(\"2\",actualStrList.get(1));");

        // リストの値をインデックスで取得
        List<String> actualStrList = new ArrayList<>(Arrays.asList("1", "2"));

        assertEquals("2", actualStrList.get(1));
    }

    @Test
    public void test_getFirst() {
        System.out.println("*------------------------*");
        System.out.println("// リストの先頭を取得");
        System.out.println("List<String>actualStrList=newArrayList<>(Arrays.asList(\"1\",\"2\",\"3\"));");
        System.out.println("assertEquals(\"1\",actualStrList.getFirst());");

        // リストの先頭を取得
        List<String> actualStrList = new ArrayList<>(Arrays.asList("1", "2", "3"));

        assertEquals("1", actualStrList.getFirst());
    }

    @Test
    public void test_getLast() {
        System.out.println("*------------------------*");
        System.out.println("// リストの最後を取得");
        System.out.println("List<String>actualStrList=newArrayList<>(Arrays.asList(\"1\",\"2\"));");
        System.out.println("assertEquals(\"2\",actualStrList.getLast());");

        // リストの最後を取得
        List<String> actualStrList = new ArrayList<>(Arrays.asList("1", "2"));

        assertEquals("2", actualStrList.getLast());
    }

    @Test
    public void  test_get_for() {
        System.out.println("*------------------------*");
        System.out.println("//インデックスで取得");
        System.out.println("List<String>actualStrList=newArrayList<String>(Arrays.asList(\"1\",\"2\",\"3\"));");
        System.out.println("List<String>expected=newArrayList<String>(Arrays.asList(\"1\",\"2\",\"3\"));");
        System.out.println("for (int i = 0; i < actualStrList.size(); i++) {");
        System.out.println("assertEquals(expected.get(i),actualStrList.get(i));");
        System.out.println("}");

        // インデックスで取得
        List<String> actualStrList = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "3"));

        for (int i = 0; i < actualStrList.size(); i++) {
            assertEquals(expected.get(i), actualStrList.get(i));
        }
    }

    @Test
    public  void test_get_foreach()  {
        System.out.println("*------------------------*");
        System.out.println("//foreachで取得");
        System.out.println("List<String>actualStrList=newArrayList<String>(Arrays.asList(\"1\",\"2\",\"3\"));");
        System.out.println("List<String>expected=newArrayList<String>(Arrays.asList(\"1\",\"2\",\"3\"));");
        System.out.println("int i=0;");
        System.out.println("for (String val : actualStrList) {");
        System.out.println("assertEquals(expected.get(i),val);");
        System.out.println("i++;");
        System.out.println("}");

        // foreachで取得
        List<String> actualStrList = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "3"));

        int i = 0;
        for (String val : actualStrList) {
            assertEquals(expected.get(i),val);
            i++;
        }
    }

    @Test
    public  void  test_get_iterator() {
        System.out.println("*------------------------*");
        System.out.println("//イテレーターでリストを取得");
        System.out.println("List<String>list=newArrayList<String>(Arrays.asList(\"1\",\"2\",\"3\"));");
        System.out.println("List<String>expected=newArrayList<String>(Arrays.asList(\"1\",\"2\",\"3\"));");
        System.out.println("int i=0;");
        System.out.println("for (Iterator<String> it = list.iterator(); it.hasNext(); ) {");
        System.out.println("String val=it.next();");
        System.out.println("assertEquals(expected.get(i),val);");
        System.out.println("i++;");
        System.out.println("}");

        // イテレーターでリストを取得
        List<String> list = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "3"));

        int i = 0;
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String val = it.next();
            assertEquals(expected.get(i),val);
            i++;
        }
    }

    @Test
    public  void  test_get_listIterator() {
        System.out.println("*------------------------*");
        System.out.println("// リストイテレーターで取得");
        System.out.println("List<String> list = new ArrayList<String>(Arrays.asList(\"1\", \"2\", \"3\"));");
        System.out.println("List<String> expected = new ArrayList<String>(Arrays.asList(\"1\", \"2\", \"3\"));");
        System.out.println("ListIterator<String> listIterator = list.listIterator();");
        System.out.println("int i = 0;");
        System.out.println("while (listIterator.hasNext()) {");
        System.out.println("assertEquals(expected.get(i),listIterator.next());");
        System.out.println("i++;");
        System.out.println("}");

        // リストイテレーターで取得
        List<String> list = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "3"));

        ListIterator<String> listIterator = list.listIterator();

        int i = 0;
        while (listIterator.hasNext()) {
            assertEquals(expected.get(i),listIterator.next());
            i++;
        }
    }

    @Test
    public  void test_addAll() {
        System.out.println("*------------------------*");
        System.out.println("// リストの末尾に新なリストを追加");
        System.out.println("List<String> actualStrList = new ArrayList<String>(Arrays.asList(\"1\", \"2\", \"3\"));");
        System.out.println("List<String> expected = new ArrayList<String>(Arrays.asList(\"1\", \"2\", \"3\", \"4\", \"5\", \"6\"));");
        System.out.println("List<String> addList = new ArrayList<String>(Arrays.asList(\"4\", \"5\", \"6\"));");
        System.out.println("actualStrList.addAll(addList);");
        System.out.println("assertEquals(expected, actualStrList);");

        // リストの末尾に新なリストを追加
        List<String> actualStrList = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6"));

        List<String> addList = new ArrayList<String>(Arrays.asList("4", "5", "6"));
        actualStrList.addAll(addList);

        assertEquals(expected, actualStrList);
    }

    @Test
    public  void test_addAll_index() {
        // リストの指定したインデックスに新なリストを追加
        List<String> actualStrList = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "4", "5", "6", "3"));

        List<String> addList = new ArrayList<String>(Arrays.asList("4", "5", "6"));
        actualStrList.addAll(2, addList);

        assertEquals(expected, actualStrList);
    }

    @Test
    public  void test_isEmpty() {
        // リストの要素有無を取得
        List<String> emptyList = new ArrayList<String>();
        List<String> notEmptyList = new ArrayList<String>(Arrays.asList("1", "2", "3"));

        assertTrue(emptyList.isEmpty());
        assertFalse(notEmptyList.isEmpty());
    }

    @Test
    public  void test_contains() {
        // 指定した値がリスト要素にあるかを確認
        List<String> list = new ArrayList<String>(Arrays.asList("1", "2", "3"));

        assertTrue(list.contains("2"));
    }

    @Test
    public  void test_contains_All() {
        // 指定した値がリスト要素にあるかを確認
        List<String> list = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "3"));

        assertTrue(list.containsAll(expected));
    }

    @Test
    public  void test_indexOf() {
        // 指定された値のあるインデックスを取得する
        List<String> list = new ArrayList<String>(Arrays.asList("1", "2", "3"));
        int expected = list.indexOf("2");

        assertEquals(1, expected);

    }

    @Test
    public  void test_remove() {
        // 指定した値を削除
        List<String> list = new ArrayList<String>(Arrays.asList("1", "2", "3", "4"));
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "4"));

        list.remove("3");

        assertEquals(expected, list);
    }

    @Test
    public  void test_remove_index() {
        // 指定したインデックスにある値を削除
        List<String> list = new ArrayList<String>(Arrays.asList("1", "2", "3", "4"));
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "3"));

        list.remove(3);

        assertEquals(expected, list);
    }

    @Test
    public  void test_removeAll() {
        // 重複した値を削除
        List<String> list1 = new ArrayList<String>(Arrays.asList("1", "2", "3", "4"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("1", "2", "2"));
        List<String> expected = new ArrayList<String>(Arrays.asList("3", "4"));

        list1.removeAll(list2);

        assertEquals(expected, list1);
    }

    @Test
    public  void test_remove_index_model() {
        // 指定したインデックスにあるモデルクラスの値を削除
        List<Model> list = new ArrayList<Model>(
                Arrays.asList(
                        new Model(1),
                        new Model(2),
                        new Model(3)
                )
        );

        List<Model> expected = new ArrayList<Model>(
                Arrays.asList(
                        new Model(1),
                        new Model(3)
                )
        );
        list.remove(1);

        assertEquals(expected.size(), list.size());

        for (int i = 0; i < list.size(); i++) {
            assertEquals(expected.get(i).getId(), list.get(i).getId());
        }
    }

    @Test
    public  void test_retainAll() {
        // 重複していない値を削除
        List<String> list1 = new ArrayList<String>(Arrays.asList("1", "2", "3", "4"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("1", "2", "2"));
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2"));

        list1.retainAll(list2);

        assertEquals(expected, list1);
    }

    @Test
    public  void test_sort() {
        // ソート昇順
        List<String> list = new ArrayList<String>(Arrays.asList("3", "1", "2", "4"));
        List<String> expected = new ArrayList<String>(Arrays.asList("1", "2", "3", "4"));

        list.sort(Collections.reverseOrder().reversed());

        assertEquals(expected, list);
    }

    @Test
    public  void test_sort_reverse() {
        // ソート逆順
        List<String> list = new ArrayList<String>(Arrays.asList("3", "1", "2", "4"));
        List<String> expected = new ArrayList<String>(Arrays.asList("4", "3", "2", "1"));

        list.sort(Collections.reverseOrder());

        assertEquals(expected, list);
    }

    @Test
    public  void test_clear() {
        // リストクリア
        List<String> list = new ArrayList<String>(Arrays.asList("3", "1", "2", "4"));
        list.clear();

        assertTrue(list.isEmpty());
    }

    //
    @Test
    public  void test_stream_map() {
        List<String> list = new ArrayList<String>(Arrays.asList("1", "2", "3", "4"));

        String[] values = new String[] {"1", "2", "3", "4"};

        List<String> newlist = new ArrayList<String>();

        list.stream()
                .map(value -> value)
                .forEach(newlist::add);

        assertEquals(list, newlist);
    }

    @Test
    public  void test_stream_map_model() {
        List<Model> list = new ArrayList<Model>(
                Arrays.asList(
                        new Model(1),
                        new Model(2)
                )
        );

        List<Model> expected = List.copyOf(list);

        List<Model> newlist = new ArrayList<Model>();

        list.stream()
                .map(model -> model)
                .forEach(newlist::add);

        assertEquals(list, newlist);
    }

    // 指定された値を取得してリストを作成
    @Test
    public void test_stream_filter()
    {
        List<String> list = new ArrayList<String>(Arrays.asList("1", "2", "3", "4"));
        List<String> newlist = new ArrayList<String>();
        List<String> actual = new ArrayList<String>(List.of("3"));

        list.stream()
                .filter(value -> value.equals("3"))
                .forEach(newlist::add);

        assertEquals(actual, newlist);
    }

    // 指定された値を取得してリストを作成
    // ※リスト内はmodel
    @Test
    public  void test_stream_filter_model() {
        List<Model> list = new ArrayList<Model>(
                Arrays.asList(
                        new Model(1),
                        new Model(2)
                )
        );

        List<Model> newlist = new ArrayList<Model>();
        List<Model> actual = new ArrayList<Model>(List.of(new Model(2)));

        list.stream()
                .filter(model -> model.id == 2)
                .forEach(newlist::add);

        assertEquals(actual.getFirst().id, newlist.getFirst().id);
    }


}