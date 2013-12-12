<?php

require_once('FirePHPCore/fb.php');

$return_order = "{
   \"id\": \"395658190564485\",
   \"user\": {
      \"name\": \"\u9ec3\u7da0\u7d05\",
      \"id\": \"100002703091168\"
   },
   \"application\": {
      \"name\": \"Test Application\",
      \"namespace\": \"test_app\",
      \"id\": \"364579323556504\"
   },
   \"actions\": [
      {
         \"type\": \"charge\",
         \"status\": \"completed\",
         \"currency\": \"TWD\",
         \"amount\": \"1000\",
         \"time_created\": \"2013-12-05T07:39:38+0000\",
         \"time_updated\": \"2013-12-05T07:39:38+0000\"
      }
   ],
   \"refundable_amount\": {
      \"currency\": \"TWD\",
      \"amount\": \"1000\"
   },
   \"items\": [
      {
         \"type\": \"IN_APP_PURCHASE\",
         \"product\": \"xxxxxxxxxxx.html\",
         \"quantity\": 1
      }
   ],
   \"country\": \"TW\",
   \"request_id\": \"562180\",
   \"created_time\": \"2013-12-05T07:39:38+0000\",
   \"test\": 1,
   \"payout_foreign_exchange_rate\": 0.033452694
}";

$order_details = json_decode($return_order, true);

fb('json string: ' . $return_order);

fb('json object: ' . $order_details);

// array size
fb(count($order_details['actions']));

// isset json data
fb(isset($order_details['disputes']));

?>