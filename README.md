# pinterest

Public Java SDK for Pinterest's new API.

Some example uses are

- Construct a new Pinterest SDK
  - `final Pinterest pinterest = new Pinterest("<INSESRT_YOUR_PINTEREST_ACCESS_TOKEN>");`
- To get a Pin (with all possible fields) via a Pin ID:
  - `final PinResponse pin = pinterest.getPin("<INSESRT_PIN_ID>", new PinFields().setAll());`
- To get a Pin with only default fields (URL, note, link, ID) set
  - `final PinResponse pin = pinterest.getPin("<INSESRT_PIN_ID>");`
- To get all the Pins from a board with default fields
  - `final Pins pins = pinterest.getPinsFromBoard("<INSESRT_BOARD_NAME>");`
- To get all the Pins from a board with all fields
  - `final Pins pins = pinterest.getPinsFromBoard("<INSESRT_BOARD_NAME>", new PinFields().setAll());`
  
... more to come soon. (non-GET endpoints are currently in construction)

Feel free to make an issue if you find any bugs or have a suggestion!  
