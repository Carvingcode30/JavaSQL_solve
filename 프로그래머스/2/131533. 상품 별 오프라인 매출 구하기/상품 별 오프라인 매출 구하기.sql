SELECT a.product_code, sum(b.sales_amount * a.price) as sales
from product a
join offline_sale b
on a.product_id = b.product_id
group by b.product_id
order by sales desc, a.product_code;