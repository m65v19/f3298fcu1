package ru.oop.task2;

import ru.oop.task2.Person;
import ru.oop.task2.Position;

/**
 * Транспорт. Машина, велосипед, автобус, трамвай - you name it
 */
interface Transport extends Positioned {

  /**
   * Едет к заданной поззиции position как можно ближе и высаживает там человека
   *
   * @param position
   * @return Person
   */
  public Person goAsNearAsPossible(Position position);
}
