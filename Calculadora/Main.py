from PyQt5 import uic,QtWidgets
import mysql.connector

#Banco de Dados
bdd = mysql.connector.connect(
  host='localhost',
  user='root', 
  password='',
  database='python'
)



#Somar !! Não está somando !! problema na hora de mandar um int, estou mandando uma string e não sei mudar.
def somar():
  n1 = int(calculadora.nA.text())
  n2 = int(calculadora.nB.text())
  R = n1+n2

  cursor = bdd.cursor()
  cursor.execute("INSERT INTO calculos (calculo,valor) VALUES (%s,%s)",('Soma',R))
  bdd.commit()

  Resultado.total.setText(str(R))

  Resultado.show()
  calculadora.close()

#Subtração
def subtra():
  n1 = int(calculadora.nA.text())
  n2 = int(calculadora.nB.text())
  R = n1-n2
  cursor = bdd.cursor()
  cursor.execute("INSERT INTO calculos (calculo,valor) VALUES (%s,%s)",('Subtração',R))
  bdd.commit()
  Resultado.total.setText(str(R))
  Resultado.show()
  calculadora.close()

#Multiplicar
def multiplicar():
  n1 = int(calculadora.nA.text())
  n2 = int(calculadora.nB.text())
  R = n1*n2
  cursor = bdd.cursor()
  cursor.execute("INSERT INTO calculos (calculo,valor) VALUES (%s,%s)",('Multiplicação',R))
  bdd.commit()
  Resultado.total.setText(str(R))
  Resultado.show()
  calculadora.close()

#Dividir
def Dividir():
  n1 = float(calculadora.nA.text())
  n2 = float(calculadora.nB.text())
  R = n1/n2
  cursor = bdd.cursor()
  cursor.execute("INSERT INTO calculos (calculo,valor) VALUES (%s,%s)",('Divisão',R))
  bdd.commit()
  Resultado.total.setText(str(R))
  Resultado.show()
  calculadora.close()

#voltar
def voltar():
  calculadora.nA.setText("")
  calculadora.nB.setText("") 
  Resultado.close()
  calculadora.show()

#Fechar Calculadora
def fechar():
  Resultado.close()
  calculadora.close()

#Voltar do historico
def voltarH():
  calculadora.show()
  Phistorico.close()
  Resultado.close()

#Abrir historico
def abrirH():
  Phistorico.show() 

  cursor = bdd.cursor()
  sql = "SELECT * FROM calculos"
  cursor.execute(sql)
  historico = cursor.fetchall()

  Phistorico.tableWidget.setRowCount(len(historico))
  Phistorico.tableWidget.setColumnCount(2)

  for x in range(0, len(historico)):
    for h in range(0, 2):
      Phistorico.tableWidget.setItem(x,h,QtWidgets.QTableWidgetItem(str(historico[x][h]))) 


  

app=QtWidgets.QApplication([])
calculadora=uic.loadUi("calculadora.ui")
Resultado=uic.loadUi("Resultado.ui")
Phistorico=uic.loadUi("Historico.ui")
calculadora.show()
#Somar
calculadora.soma.clicked.connect(somar)
#Dividir
calculadora.dividir.clicked.connect(Dividir)
#Multiplicador
calculadora.multiplicar.clicked.connect(multiplicar)
#subtrair
calculadora.subtracao.clicked.connect(subtra)
#voltar
Phistorico.voltar.clicked.connect(voltarH)
Resultado.voltar.clicked.connect(voltar)
#Historico
calculadora.total.clicked.connect(abrirH)
Resultado.total_2.clicked.connect(abrirH)
#Fechar Calculadora
calculadora.Sair.clicked.connect(fechar)
Resultado.Sair.clicked.connect(fechar)

app.exec_()
