package M1;

import A1.n;
import I7.m;
import X.L;
import Z5.y;
import androidx.lifecycle.f0;
import c3.C0573e;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.game.TutorialGameFragment;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.list.TutorialListFragment;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import com.buzbuz.smartautoclicker.settings.SettingsFragment;
import java.io.File;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class e extends o6.l implements InterfaceC1162a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3310f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i4, Object obj) {
        super(0);
        this.f3309e = i4;
        this.f3310f = obj;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f3309e) {
            case 0:
                return (h) this.f3310f;
            case 1:
                return (f0) ((e) this.f3310f).a();
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return (TutorialGameFragment) this.f3310f;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return (f0) ((e) this.f3310f).a();
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return (TutorialListFragment) this.f3310f;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return (f0) ((e) this.f3310f).a();
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return (V4.k) this.f3310f;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return (f0) ((e) this.f3310f).a();
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return (ScenarioListFragment) this.f3310f;
            case 9:
                return (f0) ((e) this.f3310f).a();
            case 10:
                Object obj = L.f6672d;
                File file = (File) this.f3310f;
                synchronized (obj) {
                    L.f6671c.remove(file.getAbsolutePath());
                }
                return y.f7506a;
            case 11:
                return (Y4.d) this.f3310f;
            case 12:
                return (f0) ((e) this.f3310f).a();
            case 13:
                File file2 = (File) ((n) this.f3310f).a();
                String name = file2.getName();
                o6.j.d(name, "getName(...)");
                if (m.t0('.', name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    o6.j.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 14:
                return (b5.d) this.f3310f;
            case 15:
                return (f0) ((e) this.f3310f).a();
            case 16:
                return (C0573e) this.f3310f;
            case 17:
                return (f0) ((e) this.f3310f).a();
            case 18:
                return (SettingsFragment) this.f3310f;
            default:
                return (f0) ((e) this.f3310f).a();
        }
    }
}
