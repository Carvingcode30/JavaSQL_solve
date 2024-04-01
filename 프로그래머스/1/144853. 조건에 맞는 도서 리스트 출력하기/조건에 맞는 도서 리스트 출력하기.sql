SELECT BOOK_ID, date_format(published_date, '%Y-%m-%d') AS PUBLISHED_DATE 
from book 
where YEAR(published_date) = 2021 and category = '인문' 
order by published_date;