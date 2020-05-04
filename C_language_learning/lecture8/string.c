#include <stdio.h>
#include <string.h>

struct Books {
    char  title[50];
    char  author[50];
    char  subject[100];
    int   book_id;
};


int main() {
    struct Books book_1 = {"Harry Potter", "author", "novel", 1234};
    // strcpy(book_1.title, "Harry Potter");
    // book_1.book_id = 123;
    printf("book name is %s", book_1.title);
    return 0;
}

// struct Sphere {
//     double raidus;
//     double volume;

// }


// struct Sphere sphere_1;
// sphere_1.radius = input_value[0];
// sphere_1.volume = calculate_volume(Sphere_1.radius);

// struct Sphere sphere_2;
// sphere_2.radius = input_value[1];
// sphere_2.volume = calculate_volume(Sphere_2.radius);

// double total_volume = sphere_1.volume + sphere_2.volume;

