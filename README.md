# READ ME

## Requirements
* [Polarion](https://polarion.plm.automation.siemens.com/downloads)

## Setup

* Set `java.jdt.ls.java.home` in [polarion-vscode-demo.code-workspace](polarion-vscode-demo.code-workspace) to your Java installation path
    * Default not set
* Set `location path=""` in [polarion-platform.target](polarion-platform.target) to your Polarion home path
    * Default `C:\Polarion\polarion`
* Set `-Dcom.polarion.home=` in [Polarion_Server.launch](Polarion_Server.launch) to your Polarion home path
    * Default `C:\Polarion\polarion`
* Set `location value=""` in [Polarion_Server.launch](Polarion_Server.launch) to your Polarion workspace folder
    * Default `C:\Polarion\data\workspace`

## Notes
* Configurations apply to Polarion V2404
* Some additional settings need to be modified when executing in linux environment

[![image](https://cip-alpha.eu/site/assets/files/1024/alpha_en_20mm.0x130.png)](https://cip-alpha.eu/en/)