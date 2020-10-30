# Installing
## NS2
## nam
## xgraph

1. Updating libraries ->
  Run Command ->
    `sudo apt-get update`

2. Installing ns2
  Run command ->
    `sudo apt-get install ns2 -y`
  Use command ns to check if ns two is installed.
  Press `ctrl+z` to go out.

3. Installing nam
  Run command ->
    `sudo apt-get install nam -y`
  Use command nam to check if nam is installed.
  Press `ctrl+z` to go out.

4. Getting Xgraph
  Installing will not work on new versions of linux so.
  Download file xgraph.tar should be in same folder as this tutorial.
  Extract that file in your linux, now open terminal at same location.
  Run command
  `sudo cp xgraph /bin/xgraph`
  After this now type
  `sudo chmod 777 /bin/xgraph`

### To open a file in xgraph
Click file then read file and all done, you can read multiple files one by one.

### Notice.
Make sure you don't add `-geometry` tags in your tcl file.
the code `exec xgraph out0.tr out1.tr` would work fine
### Tip
Keep the xgraph file in same folder as your tcl files so you won't need to search far.
