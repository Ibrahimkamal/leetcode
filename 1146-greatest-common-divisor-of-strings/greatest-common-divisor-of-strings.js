/**
 * @param {string} str1
 * @param {string} str2
 * @return {string}
 */
const gcd_ = function (a, b) {
    while (b) {
        let temp = b
        b = a % b
        a = temp
    }
    return a

}

var gcdOfStrings = function(str1, str2) {
    let len1 = str1.length
    let len2 = str2.length
    const gcd = gcd_(Math.max(len1, len2), Math.min(len1, len2))
    
    const common=str1.substring(0, gcd)
    for(let i=0;i<len1;i+=gcd){
        if(str1.substring(i,i+gcd)!==common){
            return ""
        }
    }
    for(let i=0;i<len2;i+=gcd){
        if(str2.substring(i,i+gcd)!==common){
            return ""
        }
    }
    return common
};