import React from 'react';
import { View, Text, StyleSheet } from 'react-native';

export default function Conheca(){
  return (
    <View style={css.contaier}>
      <Text style={css.TextTitulo}>Conheça</Text>
      <Text style={css.TextSobre} >O Câmpus Pelotas-Visconde da Graça (CaVG), é um dos câmpus vinculados ao Instituto Federal de Educação, Ciência e Tecnologia Sul-rio-grandense (IFSul), instituição de educação profissional técnica de nível médio e superior de graduação e pós-graduação, tendo como origem o Conjunto Agrotécnico Visconde da Graça. O CaVG, como é conhecido, passou a constituir o IFSul a partir da emissão da Portaria 715/2010 do Ministro de Estado da Educação, que consolidou a decisão tomada pela Comunidade em referendo realizado no então Conjunto Agrotécnico Visconde da Graça, ligado à Universidade Federal de Pelotas (UFPel).</Text>
    </View>
  )
}

const css = StyleSheet.create({

  contaier: {
    flex: 1,
    padding: '2%',
    alignItems: 'center',
  },

  TextTitulo: {
    marginTop: 30,
    marginBottom: 20,
    fontSize: 25,
    textAlign:'center',
  },

  TextSobre: {
    fontSize: 16,
    margin: 10,
    textAlign: 'justify'
  }
})