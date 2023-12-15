'use strict';


let s = "The quick brown fox"
let v=[];
let c=[];

function vowelsAndConsonants(s) {
    
    // console.log(s.length)
    for(let i=0;i<s.length;i++){
        if(checkVowel(s[i])){
           
            v.push(s[i])
           
        }else if(s[i]!==''){
           
            c.push(s[i])
        }
    }
    // console.log(v)
    // console.log(c)
    
    for(let i=0;i<v.length;i++){
        console.log(v[i])
    }
    
    for(let i=0;i<c.length;i++){
        console.log(c[i])
    }
}

function checkVowel(ch){
    return  (ch === 'a' || ch ==='e' || ch === 'i' || ch === 'o' || ch === 'u');
}

vowelsAndConsonants(s);
