Feature: CRUD Operations for Gallery

  Background:
    Given the admin navigates to the gallery page

  Scenario: Create a new gallery item
    When the admin clicks on Add New Photo
    And the admin uploads a photo "C:\\Users\\asus\\Pictures\\Basket-edit.jpg"
    And the admin enters the title "Kegiatan A"
    And the admin selects the category "Pojok Sekolah"
    And the admin clicks on Save
    Then the new gallery item "Kegiatan A" should be displayed in the gallery list

  Scenario: Read data of a gallery
    Given a galleryy item "Kegiatan A" exists
    When the admin views the "Kategori" data

  Scenario: Update an existing gallery item
    Given a gallery item "Kegiatan A" exists
    When the admin clicks on "Edit" for "Kegiatan A"
    And the admin updates the title to "Kegiatan B"
    And the admin updates the category to "Prestasi"
    And the admin clicks on "Save"
    And the category should be "Prestasi"

  Scenario: Delete a gallery item
    Given a galleryyy item "Kegiatan A" exists
    When the admin clicks on "Delete" for "Kegiatan A"
    And the admin confirms the deletion in the modal
    Then the gallery item "Kegiatan A" should not be displayed in the gallery list


  Scenario: User downloads curriculum file
    Given the user is on the curiculum page public
    When the user clicks the download button public




