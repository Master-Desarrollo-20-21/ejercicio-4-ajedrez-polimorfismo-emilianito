public enum Color {
    WHITE('W'),
    BLACK('B'),
    NONE('N');

    private char value;

    Color(char value){
        this.value = value;
    }

    public char getValue(){
        return value;
    }

    public static Color valueOf(char c){
        for (Color color: values()){
            if(color.value == c){
                return color;
            }
        }
        return null;
    }
}
