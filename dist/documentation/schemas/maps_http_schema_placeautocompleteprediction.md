<!--- This is a generated file, do not edit! -->
<!--- [START maps_http_schema_placeautocompleteprediction] -->
<h3 class="schema-object" id="PlaceAutocompletePrediction">Place Autocomplete Prediction</h3>

| Field                   | Required | Type                                                                                                                     | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| :---------------------- | -------- | ------------------------------------------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `description`           | optional | string                                                                                                                   | <div class="nonref-property-description"><p>Contains the human-readable name for the returned result. For <code>establishment</code> results, this is usually the business name.</p></div>                                                                                                                                                                                                                                                                                                                             |
| `matched_substrings`    | optional | Array&lt;[PlaceAutocompleteMatchedSubstring](#PlaceAutocompleteMatchedSubstring "PlaceAutocompleteMatchedSubstring")&gt; | <div class="ref-property-description"><p>A list of substrings that describe the location of the entered term in the prediction result text, so that the term can be highlighted if desired.</p><p>See <a href="#PlaceAutocompleteMatchedSubstring">PlaceAutocompleteMatchedSubstring</a> for more information.</div>                                                                                                                                                                                                   |
| `place_id`              | optional | string                                                                                                                   | <div class="nonref-property-description"><p>A textual identifier that uniquely identifies a place. To retrieve information about the place, pass this identifier in the placeId field of a Places API request. For more information about place IDs, see the <a href="https://developers.google.com/maps/documentation/places/web-service/place-id">Place IDs</a> overview.</p></div>                                                                                                                                  |
| `reference`             | optional | string                                                                                                                   | <div class="nonref-property-description"><p>(Deprecated) See place_id.</p></div>                                                                                                                                                                                                                                                                                                                                                                                                                                       |
| `structured_formatting` | optional | [PlaceAutocompleteStructuredFormat](#PlaceAutocompleteStructuredFormat "PlaceAutocompleteStructuredFormat")              | <div class="ref-property-description"><p>Provides pre-formatted text that can be shown in your autocomplete results.</p><p>See <a href="#PlaceAutocompleteStructuredFormat">PlaceAutocompleteStructuredFormat</a> for more information.</div>                                                                                                                                                                                                                                                                          |
| `terms`                 | optional | Array&lt;[PlaceAutocompleteTerm](#PlaceAutocompleteTerm "PlaceAutocompleteTerm")&gt;                                     | <div class="ref-property-description"><p>Contains an array of terms identifying each section of the returned description (a section of the description is generally terminated with a comma). Each entry in the array has a <code>value</code> field, containing the text of the term, and an <code>offset</code> field, defining the start position of this term in the description, measured in Unicode characters.</p><p>See <a href="#PlaceAutocompleteTerm">PlaceAutocompleteTerm</a> for more information.</div> |
| `types`                 | optional | Array&lt;string&gt;                                                                                                      | <div class="nonref-property-description"><p>Contains an array of types that apply to this place. For example: <code>[ "political", "locality" ]</code> or <code>[ "establishment", "geocode", "beauty_salon" ]</code>. The array can contain multiple values. Learn more about <a href="https://developers.google.com/maps/documentation/places/web-service/supported_types">Place types</a>.</p></div>                                                                                                                |

<!--- [END maps_http_schema_placeautocompleteprediction] -->