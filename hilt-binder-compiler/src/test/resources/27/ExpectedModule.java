// Generated by @BindType. Do not modify!

import com.paulrybitskyi.hiltbinder.keys.MapIntKey;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoMap;

@Module
@InstallIn(SingletonComponent.class)
public interface HiltBinder_SingletonComponentModule {
    @Binds
    @IntoMap
    @MapIntKey(1)
    Testable bind_Test1(Test1 binding);

    @Binds
    @IntoMap
    @MapIntKey(2)
    Testable bind_Test2(Test2 binding);

    @Binds
    @IntoMap
    @MapIntKey(3)
    Testable bind_Test3(Test3 binding);
}