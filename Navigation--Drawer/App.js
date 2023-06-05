import React from 'react';
import { NavigationContainer } from '@react-navigation/native';
import { createDrawerNavigator } from '@react-navigation/drawer';

import Home from './src/Pages/Home/'
import Conheca from './src/Pages/Conheca/'
import Cursos from './src/Pages/Cursos/'
import Equipe from './src/Pages/Equipe/'
import TDS from './src/Pages/TDS/'

const Drawer= createDrawerNavigator();

export default function App(){
  return(
    <NavigationContainer>
      <Drawer.Navigator>
        <Drawer.Screen name="Página Inicial" component={Home} />
        <Drawer.Screen name="Conheça o CAVG" component={Conheca} />
        <Drawer.Screen name="Equipe Direitiva" component={Equipe} />
        <Drawer.Screen name="Curso TDS" component={TDS} />
        <Drawer.Screen name="Cursos" component={Cursos} />
      </Drawer.Navigator>
    </NavigationContainer>
  )
}

