
package org.campusmolndal.grupp2ecoeatsab.services;

import org.campusmolndal.grupp2ecoeatsab.models.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {

    private List<Profile> profiles = new ArrayList<>();

    // Metod för att skapa en ny profil
    public Profile createProfile(Profile profile) {
        profiles.add(profile);
        return profile;
    }

    // Metod för att hämta alla profiler
    public List<Profile> getAllProfiles() {
        return profiles;
    }

    // Metod för att hämta en profil baserat på dess ID
    public Profile getProfileById(Long id) {
        for (Profile profile : profiles) {
            if (profile.getId().equals(id)) {
                return profile;
            }
        }
        return null; // Returnera null om profilen med det angivna ID:t inte hittades
    }

    // Metod för att uppdatera en profil
    public Profile updateProfile(Long id, Profile updatedProfile) {
        for (Profile profile : profiles) {
            if (profile.getId().equals(id)) {
                profile.setFirstName(updatedProfile.getFirstName());
                profile.setLastName(updatedProfile.getLastName());
                profile.setEmail(updatedProfile.getEmail());
                // Uppdatera andra fält vid behov
                return profile;
            }
        }
        return null; // Returnera null om profilen med det angivna ID:t inte hittades
    }


    // Metod för att ta bort en profil
    public void deleteProfile(Long id) {
        profiles.removeIf(profile -> profile.getId().equals(id));
    }

    // Metod för att skapa eller uppdatera en profil
    public Profile createOrUpdateProfile(Profile profile) {
        for (Profile existingProfile : profiles) {
            if (existingProfile.getId().equals(profile.getId())) {
                // Profilen finns redan, uppdatera den
                return updateProfile(existingProfile.getId(), profile);
            }
        }
        // Profilen finns inte, skapa en ny
        return createProfile(profile);
    }
}
