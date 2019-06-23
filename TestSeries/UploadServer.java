/*   --------The Upload Server--------
A new website to host video and music is built up by the company X. The engineers at X are facing a major issue in identifying whether the data they receive in one of their API is of video or music.

Now, you will be given  lines of data. Each line of data consists a list of strings. Each string either represents an integer or a name. For each line of data, you need to check whether that data corresponds to a music or a video.

You need to follow the following rules to detect the data and store it:

A Music data consists of a name and an integer that denote the bitrate and nothing else.
A video data consists of a name and two integers that denote the resolution of the video and nothing else.
Rest of the data which does not match any of the formats above is to be ignored.
A music or a video name can consist of integers but it will contain at least one character of the English alphabets.
An integer in the data will consist only of integers, and it will never start with 0.
For each line of data, if it satisfies the constraints of a music then print M, if it satisfies constraints of a video print V, or else print N which means that the data has to be ignored.

Input Format

The first line contains an integer  as input denoting the total numbers of lines in the input.
Next  lines contains either two strings or three strings separated by space.

Output Format

For each data, you need to print either of the three characters N, V or M.

Constraints
1<=N<=10^5
1<=word<=15   where word is the name of either music or a video.
1<=bitrate<=10^32   where bitrate is the bitrate of the song.
1<=RESx,RESy<=10^32     where RESx and RESy denote the width and height of video in pixels.


Sample Input
3
243 5399
a12 320 240
aviation 189

Sample Output
N
V
M

Explanation :
In the given sample. the first one does not correspond to either a video or a music as it contains two integers which do not match the format of any of the two types of data.

The second data corresponds to a video as it contains one name and two integers.

The third data corresponds to a music as it contains one name and one integer.

Note: Your code should be able to convert the sample input into the sample output. However, this is not enough to pass the challenge, because the code will be run on multiple test cases. Therefore, your code must solve this problem statement.
Time Limit: 2.0 sec(s) for each input file
Memory Limit: 256 MB
Source Limit: 1024 KB

