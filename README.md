# Описание выполенной работы

## Принципы SOLID

### Single Responsibility Principle (SRP)
Класс User отвечает только за хранение и управление данными пользователя, не занимаясь другими функциями.
### Open/Closed Principle (OCP)
Интерфейс ProductFilter позволяет добавлять новые фильтры без изменения существующего кода. К примеру, PriceFilter и KeywordFilter.
### Liskov Substitution Principle (LSP)
Классы PriceFilter и KeywordFilter являются подтипами интерфейса ProductFilter, что позволяет их использовать вместо него без изменения поведения программы.
### Interface Segregation Principle (ISP)
Интерфейс DeliveryService разделен на отдельные методы, что позволяет использовать только необходимые им методы без привязки к ненужным.
### Магические числа
Вместо использования магических чисел, в фильтре по цене  определены константы.
### DRY (Don't Repeat Yourself)
Код написан таким образом, чтобы избегать ненужного повторения. Например, фильтрации товаров реализованы через интерфейс, чтобы избежать дублирования логики.


# Задача Магазин

## Описание
Это финальная задача! В этом задании попрактикуемся с правилами чистого кода и принципами SOLID.

Нужно написать программу-магазин, в которой пользователи заказывают товары. Вам предоставляется свобода в продумывании функциональности вашей программы, как и в проектировании её структуры. В процессе реализации вы должны применить принцип избегания магических чисел, DRY и как минимум 4 из 5 принципов SOLID, причём явно комментариями в коде или при отправке решения указать по одному примеру применения каждого принципа в вашем решении.

Примеры возможностей программы:
* Вывод доступных для покупки товаров
* Фильтрация товаров по ключевым словам, ценам, производителям
* Составление продуктовой корзины пользователя
* Трекинг заказа в системе доставки
* Возврат заказа, повтороение заказа
* Система рейтинга для товаров
* Простая рекомендательная система для покупок

## Реализация
1. Продумайте и зафиксируйте список возможностей вашей программы.
2. Продумайте консольный интерфейс взаимодействия пользователя с вашей программой.
3. Продумайте систему классов, которые вам понадобятся для реализации вашей программы.
4. Напишите вашу программу, явно применив вышеперечисленные принципы хорошего кода.
5. Комментариями к коду или при отправке решения укажите, в чём именно было применение каждого этого принципа (по одному примеру).
6. Протестируйте работу программы. Не забывайте про правила форматирования кода (для автоформата можете выделить код в идее и нажать **Ctrl+Alt+L**).