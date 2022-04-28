Интерфейс **FilterFlights** - общий для всех классов фильтрации. При необходимости добавить новую фильтрацию достаточно классу имплементировать это интерфейс и переопределить метод filter.
Также этот интерфейс является функциональным, то есть при необходимости можно реализовать "одноразовый" фильтр с помощью лямбды (продемонстрировала в классе Main).

Класс **FilterDepartureBeforeArrival** фильтрует список полетов, отбрасывая все полеты, в которых имеются сегменты с датой прилета ранее даты вылета. Для реализации этого фильтра использованы возможности Stream API.

Класс **FilterHoursOnLand** фильтрует список полетов, отбрасывая все полеты, в которых общее время на земле между сегментами больше заданного времени. Для более точного вычисления время в методе filter представлено в минутах.

Класс **FilterDepartureNotBeforeAppointedTime** фильтрует список полетов, отбрасывая все полеты, время вылета в котором раньше заданного времени. Для реализации этого фильтра использованы возможности Stream API.

Все три класса покрыты тестами JUnit.

В классе **Main** происходит демонстрация работы всех трех классов-фильтров. Дополнительно продемострирована возможность создания анонимного класса-фильтра с помощью лямбды (filterFlights). 