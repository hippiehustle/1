package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.buzbuz.smartautoclicker.R;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1039b extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f12316f;

    /* renamed from: a, reason: collision with root package name */
    public int f12317a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f12318b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f12319c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f12320d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f12321e;

    public C1039b(Context context, int i4) {
        super(context);
        this.f12317a = i4;
    }

    public final void a(Configuration configuration) {
        if (this.f12321e == null) {
            if (this.f12320d == null) {
                this.f12320d = new Configuration(configuration);
                return;
            }
            throw new IllegalStateException("Override configuration has already been set");
        }
        throw new IllegalStateException("getResources() or getAssets() has already been called");
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f12318b == null) {
            this.f12318b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f12318b.setTo(theme);
            }
        }
        this.f12318b.applyStyle(this.f12317a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(m.C1039b.f12316f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f12321e == null) {
            Configuration configuration = this.f12320d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f12316f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f12316f = configuration2;
                    }
                }
                this.f12321e = createConfigurationContext(this.f12320d).getResources();
            }
            this.f12321e = super.getResources();
        }
        return this.f12321e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f12319c == null) {
                this.f12319c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f12319c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f12318b;
        if (theme != null) {
            return theme;
        }
        if (this.f12317a == 0) {
            this.f12317a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f12318b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i4) {
        if (this.f12317a != i4) {
            this.f12317a = i4;
            b();
        }
    }
}
