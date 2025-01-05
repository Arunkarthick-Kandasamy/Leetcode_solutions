class Solution:
    def calculate(self, s: str) -> int:
        return (s:=f'({s.replace(" ","")})',all('(' in (s:=re.sub(r'\([^()]+\)',lambda m:str(sum(map(int,findall(r'[+-]?\d+',m[0])))),s).replace('--','+')) for _ in s)) and int(s)