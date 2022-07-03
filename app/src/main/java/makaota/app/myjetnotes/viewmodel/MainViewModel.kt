package makaota.app.myjetnotes.viewmodel

import androidx.lifecycle.ViewModel
import makaota.app.myjetnotes.data.repository.Repository

/**
 * View model used for storing the global app state.
 *
 * This view model is used for all screens.
 */
class MainViewModel(private val repository: Repository) : ViewModel() {

}