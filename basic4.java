Stringクラスの主なメソッド
　char charAt(int index).....引数に位置にある文字を返す
    boolean endsWith(String suffix)....引数の文字列で終わるかどうかの判別
    boolean equals(Object anObject).....引数が文字列かどうか判断
   boolean wqualslgnoreCase(String anothorString)......引数が文字列かどうか大文字小文字の区別なしで判断
   int indexOf(int ch)....引数の文字が最初に出現する位置を返す（文字を検索
   int indexOf(String str)......引数の文字列が最初に出現する位置を返す（文字を検索
   int lastIndexOf(int ch)......引数の文字が最後に出現する位置を返す
   int lsatIndexOf(String str)......引数の文字列が最後に出現する位置を返す
   int length()............文字列の長さを返す
   String substring(int beginIndex)......引数の位置から最後までの部分文字列
   String substring(int beginIndecx,int endIndex).......引数の開始位置から最終位置までの部分文字列をかえす
   boolean startsWith(String prefix).......引数の文字列で始まるかどうかを判断
   String toLowerCase().........文字列を小文字にする
   String toUpperCase()..........文字を大文字にする
   
StringBufferクラスの主なメソッド
    StringBuffer append(char c)  ......文字を追加
    StringBuffer append(String str) ......文字列を追加
    StringBuffer deleteCharAt(int index).....引数の位置の文字を削除する
    StringBuffer insert(int offset,char c).......引数の位置に文字を追加する
    StringBuffer insert(int offset,String str).......引数の位置に文字列を追加する
    int length()....文字数を返す
    StringBuffer replace(int start,int end,String str)......引数の位置の文字列を引数の文字列で置換する
    StirngBuffer reverse()..........文字列を逆にする
    void setCharAt(int index,char ch).......引数の位置の文字を引数の文字にする
    String toString().......Stringオブジェクトに変換