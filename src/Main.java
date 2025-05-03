class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(100);

        for (int i = 0; i < 10000; i++) {
            String id = "id" + i;
            MyTestingClass key = new MyTestingClass(id);
            Student student = new Student("Student" + i, 18 + (i % 5));
            table.put(key, student);
        }

        int[] bucketSizes = table.getBucketSizes();
        for (int i = 0; i < bucketSizes.length; i++) {
            System.out.println("Bucket " + i + ": " + bucketSizes[i] + " elements");
        }
    }
}
