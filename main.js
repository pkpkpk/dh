const { app, BrowserWindow } = require('electron');
const path = require('path');

//app.commandLine.appendSwitch('disable-software-rasterizer-logging');
//app.commandLine.appendSwitch('disable-vsync');

let mainWindow;

app.on('ready', () => {
    mainWindow = new BrowserWindow({
        webPreferences: {
            contextIsolation: false,
            enableRemoteModule: true,
            nodeIntegration: true
        }
    });

    mainWindow.loadFile(path.join(__dirname, 'index.html'));
});
