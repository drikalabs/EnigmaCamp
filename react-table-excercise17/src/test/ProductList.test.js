import React from 'react';
import {shallow} from "enzyme";
import ProductList from "../product/ProductList";

describe('Product Components',()=>{
    const appContainer = shallow(<ProductList prod={[]}/>)
    describe('render',()=>{
        it('should have one div', ()=> {
            expect(appContainer.find('div')).toHaveLength(1)
        });
        it('should have one h1 as child div',  ()=> {
            expect(appContainer.find('div').children('h1')).toHaveLength(1)
        });
        it('should have one h1 contains Ini List as child div',  ()=> {
            expect(appContainer.find('div').children('h1').text()).toBe('Ini List')
        });
        it('should have one Link as child div',  ()=> {
            expect(appContainer.find('div').children('Link')).toHaveLength(1)
        });
        it('should have one Link Data as child div',  ()=> {
            expect(appContainer.find('div').children('Link').text()).toBe('Tambah Data')
        });
        it('should have one table as child div',  ()=> {
            expect(appContainer.find('div').children('table')).toHaveLength(1)
        });
        it('should have two tr as child table from div',  ()=> {
            //belum fixs
            expect(appContainer.find('div').children('table').children('tr')).toHaveLength(1)
        });
        it('should have six th as child tr from table',  ()=> {
            expect(appContainer.find('div').children('table').children('tr').children('th')).toHaveLength(6)
        });
        it('should contains Product Id as child th from table',  ()=> {
            expect(appContainer.find('div').children('table').children('tr').childAt(0).text()).toBe('Product Id')
        });
        it('should contains Product Name as child th from table',  ()=> {
            expect(appContainer.find('div').children('table').children('tr').childAt(1).text()).toBe('Product Name')
        });
        it('should contains price as child th from table',  ()=> {
            expect(appContainer.find('div').children('table').children('tr').childAt(2).text()).toBe('Price')
        });
        it('should contains Quantity as child th from table',  ()=> {
            expect(appContainer.find('div').children('table').children('tr').childAt(3).text()).toBe('Quantity')
        });
        it('should contains Store as child th from table',  ()=> {
            expect(appContainer.find('div').children('table').children('tr').childAt(4).text()).toBe('Store')
        });
        it('should contains Action as child th from table',  ()=> {
            expect(appContainer.find('div').children('table').children('tr').childAt(5).text()).toBe('Action')
        });


    })
})