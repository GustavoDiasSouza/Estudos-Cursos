//Transferencias.
class Transferencia {
  final double valor;
  final int numeroConta;

  Transferencia(
    this.valor,
    this.numeroConta,
  );

  @override
  String toString() {
    return 'Transferencia para Conta: $numeroConta, Valor: $valor';
  }
}
