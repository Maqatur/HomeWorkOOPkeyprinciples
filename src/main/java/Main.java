public class Main {
    public static void main(String[] args) {
        FormDate formDate = new FormDate();
        formDate.day = 30;
        formDate.month = 10;
        formDate.year = 1821;
        Post post = new Post();
        post.name = "Фёдор";
        post.patronymic = "Михайлович";
        post.surname = "Достоевский";
        post.birthday = formDate.day + "." + formDate.month + "." + formDate.year;
        post.passport = "5555 № 555555";
        post.phone = "+7 (917) 000-00-00";
        post.subscription = true;
    }
}
