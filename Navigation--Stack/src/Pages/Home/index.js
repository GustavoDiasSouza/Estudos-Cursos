import React from 'react';
import { View, Text, StyleSheet } from 'react-native';

export default function Home({navigation}){
  return (
    <View style={css.contaier}>
      <Text style={css.TextTitulo} >CAMPUS CAVG</Text>
      <Text style={css.TextOp} onPress={()=> navigation.navigate('Conheça o CAVG')} >Conheça</Text>
      <Text style={css.TextOp} onPress={()=> navigation.navigate('Equipe Direitiva')} >Equipe Direitiva</Text>
      <Text style={css.TextOp} onPress={()=> navigation.navigate('Cursos')} >Cursos</Text>
      <Text style={css.TextOp} onPress={()=> navigation.navigate('Curso TDS')} >Curso de TDS</Text>
    </View>
  )
}


const css = StyleSheet.create({
  contaier: {
    flex: 1,
    alignItems: 'center',
    backgroundColor: 'white',
  },

  TextTitulo:{
    fontSize: 30,
    textAlign: 'center',
    marginTop: 50,
    color:'#195128',
  },  

  TextOp: {
    fontSize: 15,
    padding: 20,
    width: 150,
    backgroundColor: '#ccc',
    borderTopWidth: 2,
    borderTopColor: '#00500f',
    textAlign: 'center',
    marginTop: 20,
    justifyContent: 'center',
    color: '#00500f',
  },
  
})


// #195128 color 1
// #00420c color 2
// #00500f Color 3
// white color 4
