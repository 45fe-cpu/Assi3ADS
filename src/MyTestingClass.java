class MyTestingClass {
    private String id;

    public MyTestingClass(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyTestingClass other = (MyTestingClass) obj;
        return id.equals(other.id);
    }

    @Override
    public int hashCode() {
        // Horner's method (без Objects.hash)
        int hash = 0;
        for (int i = 0; i < id.length(); i++) {
            hash = hash * 31 + id.charAt(i);
        }
        return hash;
    }
}
