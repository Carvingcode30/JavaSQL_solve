-- 코드를 작성해주세요
select count(*) as fish_count, n.fish_name
from fish_name_info n
join fish_info i
on i.fish_type = n.fish_type
group by n.fish_name
order by fish_count desc;