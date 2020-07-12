package dev.cg360.nbs.reader;

public class Header {

    private byte version;
    private byte vanillaInstrumentCount;
    private int songLength;
    private int layers;
    private String title;
    private String author;
    private String originalAuthor;
    private String description;
    private int tempo; //Divided by 100.
    private byte autosave;
    private byte autosaveDuration;
    private byte timeSignature;
    private long minutesSpent;
    private long leftClicks;
    private long rightClicks;
    private long notesAdded;
    private long notesRemoved;
    private String midiSchemName;
    private byte loopEnabled;
    private byte maxLoops;
    private int loopStartTick;

    protected Header() { }

    @Override
    public String toString() {
        return "Header" +
                "\nversion=" + version +
                ",\n vanillaInstrumentCount=" + vanillaInstrumentCount +
                ",\n songLength=" + songLength +
                ",\n layers=" + layers +
                ",\n title='" + title + '\'' +
                ",\n author='" + author + '\'' +
                ",\n originalAuthor='" + originalAuthor + '\'' +
                ",\n description='" + description + '\'' +
                ",\n tempo=" + tempo +
                ",\n autosave=" + autosave +
                ",\n autosaveDuration=" + autosaveDuration +
                ",\n timeSignature=" + timeSignature +
                ",\n minutesSpent=" + minutesSpent +
                ",\n leftClicks=" + leftClicks +
                ",\n rightClicks=" + rightClicks +
                ",\n notesAdded=" + notesAdded +
                ",\n notesRemoved=" + notesRemoved +
                ",\n midiSchemName='" + midiSchemName + '\'' +
                ",\n loopEnabled=" + loopEnabled +
                ",\n maxLoops=" + maxLoops +
                ",\n loopStartTick=" + loopStartTick;
    }

    public float getAdjustedTempo() { return tempo / 100f; }

    public byte getVersion() { return version; }
    public byte getVanillaInstrumentCount() { return vanillaInstrumentCount; }
    public int getSongLength() { return songLength; }
    public int getLayers() { return layers; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getOriginalAuthor() { return originalAuthor; }
    public String getDescription() { return description; }
    public int getTempo() { return tempo; }
    public byte getAutosave() { return autosave; }
    public byte getAutosaveDuration() { return autosaveDuration; }
    public byte getTimeSignature() { return timeSignature; }
    public long getMinutesSpent() { return minutesSpent; }
    public long getLeftClicks() { return leftClicks; }
    public long getRightClicks() { return rightClicks; }
    public long getNotesAdded() { return notesAdded; }
    public long getNotesRemoved() { return notesRemoved; }
    public String getMidiSchemName() { return midiSchemName; }
    public byte getLoopEnabled() { return loopEnabled; }
    public byte getMaxLoops() { return maxLoops; }
    public int getLoopStartTick() { return loopStartTick; }

    protected void setVersion(byte version) { this.version = version; }
    protected void setVanillaInstrumentCount(byte vanillaInstrumentCount) { this.vanillaInstrumentCount = vanillaInstrumentCount; }
    protected void setSongLength(int songLength) { this.songLength = songLength; }
    protected void setLayers(int layers) { this.layers = layers; }
    protected void setTitle(String title) { this.title = title; }
    protected void setAuthor(String author) { this.author = author; }
    protected void setOriginalAuthor(String originalAuthor) { this.originalAuthor = originalAuthor; }
    protected void setDescription(String description) { this.description = description; }
    protected void setTempo(int tempo) { this.tempo = tempo; }
    protected void setAutosave(byte autosave) { this.autosave = autosave; }
    protected void setAutosaveDuration(byte autosaveDuration) { this.autosaveDuration = autosaveDuration; }
    protected void setTimeSignature(byte timeSignature) { this.timeSignature = timeSignature; }
    protected void setMinutesSpent(long minutesSpent) { this.minutesSpent = minutesSpent; }
    protected void setLeftClicks(long leftClicks) { this.leftClicks = leftClicks; }
    protected void setRightClicks(long rightClicks) { this.rightClicks = rightClicks; }
    protected void setNotesAdded(long notesAdded) { this.notesAdded = notesAdded; }
    protected void setNotesRemoved(long notesRemoved) { this.notesRemoved = notesRemoved; }
    protected void setMidiSchemName(String midiSchemName) { this.midiSchemName = midiSchemName; }
    protected void setLoopEnabled(byte loopEnabled) { this.loopEnabled = loopEnabled; }
    protected void setMaxLoops(byte maxLoops) { this.maxLoops = maxLoops; }
    protected void setLoopStartTick(int loopStartTick) { this.loopStartTick = loopStartTick; }
}
