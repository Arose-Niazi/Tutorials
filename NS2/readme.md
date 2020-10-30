# Installing
## NS2
## nam
## xgraph

1. Updating libraries ->
  Run Command ->
    `sudo apt-get update`

2. Installing ns2
  Run command
    `sudo apt-get install ns2 -y`<BR>
  Use command ns to check if ns two is installed.<BR>
  Press `ctrl+z` to go out.

3. Installing nam
  Run command
    `sudo apt-get install nam -y`<BR>
  Use command nam to check if nam is installed.<BR>
  Press `ctrl+z` to go out.

4. Getting Xgraph
  Installing will not work on new versions of linux so.<BR>
  Download file xgraph.tar should be in same folder as this tutorial.<BR>
  Extract that file in your linux, now open terminal at same location.<BR>
  Run command
  `sudo cp xgraph /bin/xgraph`<BR>
  After this now type
  `sudo chmod 777 /bin/xgraph`

### To open a file in xgraph
Click file then read file and all done, you can read multiple files one by one.

### Notice.
Make sure you don't add `-geometry` tags in your tcl file.<BR>
The code `exec xgraph out0.tr out1.tr` would work fine
### Tip
Keep the xgraph file in same folder as your tcl files so you won't need to search far.
