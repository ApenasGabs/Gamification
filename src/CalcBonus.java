public class CalcBonus {
  public int bonusDoDia;

  public int bonus(Usuario u) {
    int multiplicador = bonusDoDia;
    if (u.vip)
      multiplicador = 1;
    return multiplicador;

  }

}