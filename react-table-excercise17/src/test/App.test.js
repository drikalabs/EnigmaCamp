import React from 'react';
import {shallow} from "enzyme";
import App from '../App';

describe('APP Components',()=>{
  const appContainer=shallow(<App/>)
  describe('render',()=>{
    it('should contains one div',  ()=> {
      expect(appContainer.find('div')).toHaveLength(1)
    });
    it('should have one Header as a child to div ',  ()=> {
      expect(appContainer.find('div').children('header')).toHaveLength(1)
    });
    it('should have one image as a child to header ',  ()=> {
      expect(appContainer.find('div').children('header').childAt(0).type()).toBe('img')
    });
    it('should have one nav as a child to div ',  ()=> {
      expect(appContainer.find('div').children('nav')).toHaveLength(1)
    });
    it('should have one ul as a child to nav ',  ()=> {
      expect(appContainer.find('div').children('nav').childAt(0)).toHaveLength(1)
    });
    it('should have one h1 as a child to ul from nav ',  ()=> {
      expect(appContainer.find('nav').children('ul').children('h1')).toHaveLength(1)
    });
    it('should have three li as a child to ul from nav ',  ()=> {
      expect(appContainer.find('nav').children('ul').children('li')).toHaveLength(2)
    });
    it('should have one Switch',  ()=>{
      expect(appContainer.find('Switch')).toHaveLength(1)
    });
    it('should have three Route as Switch child',  ()=>{
      expect(appContainer.find('Switch').children('Route')).toHaveLength(3)
    });

  })
})
