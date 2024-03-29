package github.vege19.clubmarvel.dagger

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import github.vege19.clubmarvel.utils.ViewModelFactory
import github.vege19.clubmarvel.utils.ViewModelKey
import github.vege19.clubmarvel.viewmodels.ComicDetailFragmentViewModel
import github.vege19.clubmarvel.viewmodels.ComicsFragmentViewModel
import github.vege19.clubmarvel.viewmodels.DashboardFragmentViewModel
import github.vege19.clubmarvel.viewmodels.MainActivityViewModel

@Module
abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    //: Declare view models here ://

    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun mainActivityViewModel(viewModel: MainActivityViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DashboardFragmentViewModel::class)
    abstract fun dashboardFragmentViewModel(viewModel: DashboardFragmentViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ComicsFragmentViewModel::class)
    abstract fun comicsFragmentViewModel(viewModel: ComicsFragmentViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ComicDetailFragmentViewModel::class)
    abstract fun comicDetailFragmentViewModel(viewModel: ComicDetailFragmentViewModel): ViewModel

}