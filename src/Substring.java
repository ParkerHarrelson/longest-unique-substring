public record Substring(String substring, int length) {

    @Override
    public int length() {
        return length;
    }

    @Override
    public String substring() {
        return substring;
    }
}
