package by.bemn.java_intro_online.lesson04_programming_with_classes.aggregation_composition.task3;

/*
 * Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
 * столицу, количество областей, площадь, областные центры.
 */

public class Main {
    public static void main(String[] args) {
        City capitalOfRegion1 = new City("Минск");

        District district1 = new District("БЕРЕЗИНСКИЙ", new City("Березино"), 1.9);
        District district2 = new District("БОРИСОВСКИЙ", new City("Борисов"), 3.0);
        District district3 = new District("ВИЛЕЙСКИЙ", new City("Вилейка"), 2.5);
        District district4 = new District("ВОЛОЖИНСКИЙ", new City("Воложин"), 1.9);
        District district5 = new District("ДЗЕРЖИНСКИЙ", new City("Дзержинск"), 1.2);
        District district6 = new District("КЛЕЦКИЙ", new City("Клецк"), 0.097);
        District district7 = new District("КОПЫЛЬСКИЙ", new City("Копыль"), 1.6);
        District district8 = new District("КРУПСКИЙ", new City("Крупки"), 2.1);
        District district9 = new District("ЛОГОЙСКИЙ", new City("Логойск"), 2.4);
        District district10 = new District("ЛЮБАНСКИЙ", new City("Любань"), 1.9);
        District district11 = new District("МИНСКИЙ", new City("Минск"), 2);
        District district12 = new District("МОЛОДЕЧНЕНСКИЙ", new City("Молодечно"), 1.4);
        District district13 = new District("МЯДЕЛЬСКИЙ", new City("Мядель"), 1.967);
        District district14 = new District("НЕСВИЖСКИЙ", new City("Несвиж"), 0.8633);
        District district15 = new District("ПУХОВИЧСКИЙ", new City("Марьина Горка"), 2.4);
        District district16 = new District("СЛУЦКИЙ", new City("Слуцк"), 1.8);
        District district17 = new District("СМОЛЕВИЧСКИЙ", new City("Смолевичи"), 1.4);
        District district18 = new District("СОЛИГОРСКИЙ", new City("Солигорск"), 2.5);
        District district19 = new District("СТАРОДОРОЖСКИЙ", new City("Старые Дороги"), 1.4);
        District district20 = new District("СТОЛБЦОВСКИЙ", new City("Столбцы"), 1.9);
        District district21 = new District("УЗДЕНСКИЙ", new City("Узда"), 1.2);
        District district22 = new District("ЧЕРВЕНСКИЙ", new City("Червень"), 1.6);

        Region region1 = new Region("МИНСКАЯ", capitalOfRegion1,
                district1,
                district2,
                district3,
                district4,
                district5,
                district6,
                district7,
                district8,
                district9,
                district10,
                district11,
                district12,
                district13,
                district14,
                district15,
                district16,
                district17,
                district18,
                district19,
                district20,
                district21,
                district22);


        City capitalOfRegion2 = new City("Витебск");

        District district2_1 = new District("Бешенковичский", new City("Бешенковичи"), 1.249);
        District district2_2 = new District("Браславский", new City("Браслав"), 2.27);
        District district2_3 = new District("Верхнедвинский", new City("Верхнедвинск"), 2.14);
        District district2_4 = new District("Витебский", new City("Витебск"), 2.705);
        District district2_5 = new District("Глубокский", new City("Глубокое"), 1.759);
        District district2_6 = new District("Городокский", new City("Городок"), 2.980);
        District district2_7 = new District("Докшицкий", new City("Докшицы"), 2.267);
        District district2_8 = new District("Дубровенский", new City("Дубровно"), 1.249);
        District district2_9 = new District("Лепельский", new City("Лепель"), 1.822);
        District district2_10 = new District("Лиозненский", new City("Лиозно"), 1.417);
        District district2_11 = new District("Миорский", new City("Миоры"), 1.786);
        District district2_12 = new District("Оршанский", new City("Орша"), 1.707);
        District district2_13 = new District("Полоцкий", new City("Полоцк"), 3.178);
        District district2_14 = new District("Поставский", new City("Поставы"), 2.096);
        District district2_15 = new District("Россонский", new City("Россоны"), 1.926);
        District district2_16 = new District("Сенненский", new City("Сенно"), 1.966);
        District district2_17 = new District("Толочинский", new City("Толочин"), 1.498);
        District district2_18 = new District("Ушачский", new City("Ушачи"), 1.489);
        District district2_19 = new District("Чашникский", new City("Чашники"), 1.481);
        District district2_20 = new District("Шарковщинский", new City("Шарковщина"), 1.189);
        District district2_21 = new District("Шумилинский", new City("Шумилино"), 1.695);

        Region region2 = new Region("Витебская", capitalOfRegion2,
                district2_1,
                district2_2,
                district2_3,
                district2_4,
                district2_5,
                district2_6,
                district2_7,
                district2_8,
                district2_9,
                district2_10,
                district2_11,
                district2_12,
                district2_13,
                district2_14,
                district2_15,
                district2_16,
                district2_17,
                district2_18,
                district2_19,
                district2_20,
                district2_21);

        Country country = new Country("БЕЛАРУСЬ", new City("Минск"), region1, region2);

        country.getCapital();
        country.getArea();
        country.getCountOfRegions();
        country.getCapitalsOfRegions();
        country.getCapitalsOfDistricts();


    }

}
