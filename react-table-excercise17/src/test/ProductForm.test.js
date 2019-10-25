import React from 'react';
import {shallow} from "enzyme";
import ProductForm from "../product/ProductForm";

describe('ProductForm Components',()=>{
    const appContainer=shallow(<ProductForm/>)
    describe('render',()=>{
        it('should have one div', ()=> {
            expect(appContainer.find('div')).toHaveLength(1)
        });
        it('should have one h1 as child div',  ()=> {
            expect(appContainer.find('div').children('h1')).toHaveLength(1)
        });
        it('should have one h1 contains Ini Form as child div',  ()=> {
            expect(appContainer.find('div').children('h1').text()).toBe('Ini Form')
        });
        it('should have one section as child div',  ()=> {
            expect(appContainer.find('div').children('section')).toHaveLength(1)
        });
        it('should have one  form as section  child from div',  ()=> {
            expect(appContainer.find('div').children('section').children('form')).toHaveLength(1)
        });
        it('should have five input as from form as section  child from div',  ()=> {
            expect(appContainer.find('div').children('section').children('form').children('input')).toHaveLength(5)
        });
        it('should have one button as from form as section  child from div',  ()=> {
            expect(appContainer.find('div').children('section').children('form').children('button')).toHaveLength(1)
        });
        it('should have one button contains Submit as from form as section  child from div',  ()=> {
            expect(appContainer.find('div').children('section').children('form').children('button').text()).toBe('Submit')
        });
    })
})