import React,{Component} from "react";
import {
  Text,
  View,
  StyleSheet,
  TextInput,
  TouchableOpacity
} from 'react-native';

export default class Tela1 extends Component{
  
  constructor(propriedades){
    super(propriedades)
    this.state = {altura: 0, peso: 0, resul: 0, resulTexto: ""}
    this.calculo = this.calculo.bind(this)
  }

  calculo(){
    let imc = (parseFloat(this.state.peso) / (parseFloat(this.state.altura)* parseFloat(this.state.altura))).toFixed(2)

    let valorR = this.state
    let textoIMC = this.state

    valorR.resul = imc

    this.setState(valorR)

    if (valorR.resul < 18.5) {
      textoIMC.resulTexto = "MAGREZA! (GRAU 0)"
    }else if ( valorR.resul <= 24.9) {
      textoIMC.resulTexto = "NORMAL (GRAU 1)"
    }else if ( valorR.resul <= 30.9) {
      textoIMC.resulTexto = "SOBREPESO! (GRAU 2)"
    }else if ( valorR.resul > 40.0) {
      textoIMC.resulTexto = "OBESIDADE GRAVE! (GRAU 3)"
    }else {
      textoIMC.resulTexto = "Valor não informado!"
    }

    this.setState(textoIMC)
  }


  render(){
    return(
      <View style={css.container}>
        <Text style={css.textIMC}>Calculadora de IMC</Text>

        <View style={css.modelboxMessage}>
          <View>
            <Text style={css.textResult}>{this.state.resulTexto }</Text>

            <Text style={css.textResult}>{this.state.resul}</Text>

          </View>
          <Text style={css.textTituloBox} >Peso</Text>

          <TextInput style={css.boxInput} keyboardType='numeric' placeholder='Ex: 60' onChangeText={(peso) => {this.setState({peso})}}></TextInput>

          <Text style={css.textTituloBox} >Altura</Text>

          <TextInput style={css.boxInput} keyboardType='numeric' placeholder='Ex: 1.80'  onChangeText={(altura) => {this.setState({altura})}}></TextInput>

          <TouchableOpacity style={css.btn1} onPress={this.calculo}><Text style={css.btn1Texto}>Calcular</Text></TouchableOpacity>
          <Text style={css.Autor}>Autor: Gustavo Dias Souza</Text>
        </View>
      </View>
    )
  }
}

const css = StyleSheet.create({
  container:{
    flex: 1,
    backgroundColor: '#02b989',
    
  },

  modelboxMessage: {
    marginTop: 30,
    width: '100%',
    height: '100%',
    backgroundColor: '#0e2a36',
    padding: 10,
    paddingTop: 30,
    borderTopLeftRadius: 100,
    borderTopRightRadius: 100,
  },

  textIMC: {
    fontSize: 26,
    textAlign: "center",
    marginTop: 30,
    color: '#0e2a36',
    fontWeight: 'bold',
  },
    textTituloBox: {
      marginTop: 10,
      fontSize: 22,
      marginRight: 80,
      marginLeft: 80,
      color: '#02b989',
      fontWeight: 'bold',
    },
    textResult: {
      marginTop: 20,
      fontSize: 25,
      textAlign: "center",
      color: '#0e2a36',
      fontWeight: 'bold',
      color: '#02b989',
    },

  boxInput:{
    padding: 8,
    marginTop: 10,
    marginRight: 80,
    marginLeft: 80,
    fontSize: 18,
    borderRadius: 12,
    color: '#0e2a36',
    backgroundColor: '#02b989',
  },

  btn1: {
    backgroundColor: '#02b989',
    padding: 10,
    borderRadius: 20,
    marginTop: 40,
    marginRight: 60,
    marginLeft: 60,
  },
    btn1Texto: {
      fontSize: 24,
      textAlign: "center",
      color: '#0e2a36',
      fontWeight: 'bold',
    },


  Autor: {
    marginTop: 110,
    fontSize: 24,
    textAlign: 'right',
    fontWeight: 'bold',
    color: '#02b989',
  }
})