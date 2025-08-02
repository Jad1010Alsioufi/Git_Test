public class File {
    public static void main(String[] args) {
<<<<<<< HEAD
        
=======
        System.out.println("Hello");

        list.stream().collect(Collectors.summingInt(Students::getMatrNr));

        list.stream().map(Students::getfName).map(String::length).forEach(System.out::println);

        list.stream().map(Students::getSemester).forEach(System.out::println);

        Map<String, String> map = list.stream()
                                .collect(Collectors.groupingBy(Students::getfName, Collectors.mapping(Students::getFach, Collectors.joining(", "))));

        Collections.sort(list);
        System.out.println(list);
        list.sort((a, b) -> {
            return a.getfName().compareTo(b.getfName());
        });
        System.out.println(list);
>>>>>>> TestBranch
    }
}
