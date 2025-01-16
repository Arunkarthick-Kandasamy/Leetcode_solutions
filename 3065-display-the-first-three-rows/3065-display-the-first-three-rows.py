import pandas as pd

def selectFirstRows(emp: pd.DataFrame) -> pd.DataFrame:
    return emp.head(3)
    