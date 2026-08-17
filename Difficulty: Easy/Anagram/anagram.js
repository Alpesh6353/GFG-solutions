/**
 * @param {string} s1
 * @param {string} s2
 * @returns {boolean}
 */
class Solution {
    areAnagrams(s1, s2) {
        // code here
        const sorteds1 = s1.split('').sort().join('');
        const sorteds2 = s2.split('').sort().join('');
        return sorteds1===sorteds2;
    }
}