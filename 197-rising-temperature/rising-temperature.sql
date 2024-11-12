SELECT today.id 
FROM Weather AS today
INNER JOIN Weather AS yest
    ON yest.recordDate = today.recordDate - INTERVAL '1 day'
WHERE today.temperature > yest.temperature;