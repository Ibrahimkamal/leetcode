/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {
        const set=new Set(['a', 'e', 'i', 'o',  'u'])
    let list=[]
    s=s.split('')
    for(let c of s)
    {
        if(set.has(c.toLowerCase())){
            list.push(c)
        }
    }
    for(let i=0;i<s.length;i++){
        if(set.has(s[i].toLowerCase())){
            s[i]=list.pop()
        }
    }
    return s.join('')
};