There are n blacklisted IP regexes given as an array of strings, blacklisted_ips, where each string consists of a string of numeric characters, '.' or a '*' where '*' represents a wildcard character that can be replaced with 0 or more characters. For example, the regex IP "*.123.*" matches with "12.1.123.45", "1.123.435.12", but not with "1.2.3.4".

There are q IP requests to be processed given as an array of IP addresses, requests where requests[i] arrives in the ith second.

A request is blocked if it matches any of the blacklisted regex IPs, or the IP address has sent at least 2 requests in the last 5 seconds which have not been blocked.

Given requests and blacklisted_ips, for each request, report 1 if it will be blocked and 0 otherwise.

Note: All IPs are characterised by a string of four integers separated by three dots - "<number>.<number>.<number>.<number>".

Example

Suppose n = 3, blacklisted_ips = [“*111.*”, “123.*”, “34.*”], q = 7, requests = ["123.1.23.34", "121.1.23.34", "121.1.23.34", "34.1.23.34", "121.1.23.34", "12.1.23.34", "121.1.23.34"]

|Time|Request IP  |Matching Blacklisted IP|Number of unblocked requests from this IP in the last 5 seconds | Is Blocked
|:-:|    :-:    | :-: |:-:|:-:|
|1	|123.1.23.34|123.*|	0 | 1 |
|2	|121.1.23.34|  -  |	0 |	0 |
|3	|121.1.23.34|  -  |	1 | 0 |
|4	|34.1.23.34 |34.* |	0 |	1 |
|5	|121.1.23.34|  -  |	2 |	1 |
|6	|12.1.23.34 |  -  |	0 |	0 |
|7	|121.1.23.34|  -  |	1 |	0 | 

Hence the answer is [1, 0, 0, 1, 1, 0, 0].

Note : At time 7 the request IP "121.1.23.34" is not blocked because in the last 5 seconds, only the instance which came at time 3 is accepted. The request which came at time 5 was blocked, so it is not included in the current count.

`Function Description`

Complete the function validateRequests in the editor below.

validateRequests has the following parameter(s):

    string blacklisted_ips[n]:  the blacklisted IP regexes
    string requests[q]:  the IPs of incoming requests

Returns:

    int[q]: if a request is blocked report 1 and 0 otherwise

Constraints

1 ≤ n ≤ 10
1 ≤ |blacklisted_ips[i]| ≤ 15
1 ≤ q ≤ 1000
1 ≤ |requests[i]| ≤ 15
 

Input Format For Custom Testing
The first line contains an integer, n, the number of blacklisted IP regexes.
Each line i of the n subsequent lines contains a string, blacklisted_ips[i].

The next line contains an integer, q, the number of requests.
Each line i of the q subsequent lines contains a string, requests[i].

Sample Case 0
Sample Input For Custom Testing

|STDIN        |     |            FUNCTION                                                   |
|    :-:      | :-: |              :-:                                                      |
|2            |  →  |blacklisted_ips[] size n = 2                                           |
|111.*.255    |  →  |blacklisted_ips = ["111.*.255", "12."]                                 |
|12.          |     |                                                                       |
|4            |  →  |requests[] size q = 4                                                  |
|121.3.5.255  |  →  |requests = ["121.3.5.255", "12.13.5.255", "111.3.5.255", "121.3.5.255"]|
|12.13.5.255  |     |                                                                       |
|111.3.5.255  |     |                                                                       |
|121.3.5.255  |     |                                                                       |

Sample Output for Case 0:

    0
    0
    1
    0
        
Explanation

The third request is blocked since it matches with "111.*.255" -> "111.3.5.255". All the other requests can be processed.

Sample Case 1
Sample Input For Custom Testing

|STDIN      |     |            FUNCTION             |
|    :-:    | :-: |              :-:                |
|1          |  →  |blacklisted_ips[] size n = 1     |
|111.111.1. |  →  |blacklisted_ips = ["111.111.1.1"]|
|1          |  →  |requests[] size q = 1            |        
|111.111.1.1|  →  |requests = ["111.111.1.1"]       |
        
Sample Output for Case 1:

    1

Explanation

The only request is blocked since it directly matches with the only blacklisted ip.

write in this method using java 8

public static List<Integer> validateRequests(List<String> blacklisted_ips, List<String> requests){

    // write code here
}