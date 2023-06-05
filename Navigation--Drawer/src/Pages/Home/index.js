import React from 'react';
import { View, Text, StyleSheet } from 'react-native';

export default function Home({navigation}){
  return (
    <View style={ css.contaier }>
      <Text style={ css.TextTitulo } >CAMPUS CAVG</Text>
      <Text style={ css.TextOp } >Bem-Vindo ao aplicativo do CAVG!</Text>
      <Text style={ css.TextOp } >Para acessar as opções de página basta usar o menu em cima a esquerda.</Text>
    </View>
  )
}


const css = StyleSheet.create({
  contaier: {
    flex: 1,
    padding: '2%',
    alignItems: 'center',
    backgroundColor: 'white',
  },

  TextTitulo:{
    fontSize: 30,
    textAlign: 'center',
    marginTop: 50,
    marginBottom: 20,
    color:'#195128',
  },  

  TextOp: {
    fontSize: 15,
    marginBottom: 10,
    textAlign: 'center',
    justifyContent: 'center',
    color: '#00500f',
  },
  
})


// #195128 color 1
// #00420c color 2
// #00500f Color 3
// white color 4
