package org.example;

import org.example.config.MyConfig;
import org.example.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        /**
         Maven проект тузунуз (dependency spring context кошуп)
         2. Animal деген интерфейс тузуп, анын animalPlus жана animalMinus деген методдору болуш керек.
         3. Сиз кайсы жаныбарды жакшы корсонуз, ошого жараша класс тузуп,  свойствасына породасын, тусун ж.б.у.с.
         кошсонуз болот.Сиз тузгон класс Animal интерфейсин реализация кылыш керек.
         4. Person деген класс тузуп, свойствасына animal, name, age бериниз.
         5. Main'ден spring колдонуп озунуздун жана жакын бир адамыныздын жакшы коргон жаныбарын консольго чыгарыныз

         PS: bean'дер тузулуш керек жана маалыматтар application.properties файлга жазылыш керек.
         */

        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean("person", Person.class);
        person.callYourDearAnimal();
        System.out.println(person.getName() + " " + person.getAge());

        context.close();

    }
}
